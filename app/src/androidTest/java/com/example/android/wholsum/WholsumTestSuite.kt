package com.example.android.wholsum

import junit.framework.Test
import junit.framework.TestResult

class WholsumTestSuite : Test {
    /* run full suite of tests */
    private var allTestsArrays = arrayListOf<Test>()

    override fun countTestCases(): Int = allTestsArrays.size

    override fun run(result: TestResult?) {
        TODO("Not yet implemented")
    }
}