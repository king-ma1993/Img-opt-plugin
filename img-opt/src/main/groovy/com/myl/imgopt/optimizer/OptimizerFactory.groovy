package com.myl.imgopt.optimizer

import com.myl.imgopt.optimizer.impl.PngquantOptimizer
import com.myl.imgopt.optimizer.impl.ZopflipngOptimizer


/**
 * @Author: mayunlong
 */
class OptimizerFactory {

    private OptimizerFactory() {}

    static Optimizer getOptimizer(String type) {
        if (Constants.LOSSY == type) {
            return new PngquantOptimizer()
        } else if (Constants.LOSSLESS == type) {
            return new ZopflipngOptimizer()
        } else {
            throw new IllegalArgumentException("Unacceptable optimizer type. Please use lossy or lossless.")
        }
    }
}