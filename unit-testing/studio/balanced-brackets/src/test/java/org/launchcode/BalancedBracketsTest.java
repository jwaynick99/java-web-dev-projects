package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void testOnlyBracketsTrue(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void testBracketsInOrder(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void testBracketsInOrderWithOtherChars(){
        assertEquals(true, BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void testBracketBackwardOrderWithChars(){
        assertEquals(false, BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }
    @Test
    public void testWithDifferentAmount(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }
    @Test
    public void testWithMultipleBalancedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }
    @Test
    public void testWithOneClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void testOneOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testOneClosingBracketInString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }
    @Test
    public void testOneOpeningBracketInString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void testUnevenClosingBracketsInString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode]]"));
    }
    @Test
    public void testUnevenOpenBracketsInString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]"));
    }
}