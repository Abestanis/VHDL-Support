package com.abestanis.vhdl.test;

import com.abestanis.vhdl.VHDLLexerAdapter;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * SimpleLexer Tester. 
 *
 * @author <Authors name> 
 * @since <pre>Dec 22, 2014</pre> 
 * @version 1.0
 */
public class VHDLLexerTest {
    private VHDLLexerAdapter vhdlLexer = new VHDLLexerAdapter();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }
    
    @Test
    public void testSomething() throws Exception {
         vhdlLexer.start("test");
    }
} 