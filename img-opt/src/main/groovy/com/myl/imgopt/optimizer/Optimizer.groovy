package com.myl.imgopt.optimizer

import com.myl.imgopt.util.Logger
import org.gradle.api.Project

/**
 * @Author: mayunlong
 */
interface Optimizer {

    /**
     * @param project Project
     * @param log Logger
     * @param suffix String
     * @param files List<File>
     */
    void optimize(Project project, Logger log, String suffix, List<File> files)

}