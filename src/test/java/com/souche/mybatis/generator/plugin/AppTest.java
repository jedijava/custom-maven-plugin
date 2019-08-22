package com.souche.mybatis.generator.plugin;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import java.io.File;

/**
 * Unit test for simple App.
 */
public class AppTest extends AbstractMojoTestCase {
    /**
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        // required for mojo lookups to work
        super.setUp();
    }

    /**
     * @throws Exception
     */
    public void testRun() throws Exception {
        System.out.println(getBasedir());
        File testPom = new File(getBasedir(), "src/test/resources/test-plugin-config.xml");
        assertNotNull(testPom);
        App mojo = new App();
        mojo = (App) configureMojo(mojo, extractPluginConfiguration("mybatis-gen-maven-plugin", testPom));
        mojo.execute();
    }
}
