package com.souche.mybatis.generator.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "gen")//执行实例名
public class App extends AbstractMojo {
    @Parameter
    private String file;


    public void execute(){
        this.getLog().info(this.file);
        this.getLog().info("start generating . . .");
    }

}
