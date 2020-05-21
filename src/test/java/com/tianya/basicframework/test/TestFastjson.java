package com.tianya.basicframework.test;

import com.alibaba.fastjson.JSONObject;
import com.tianya.basicframework.model.PAICAssessmentStatusDataMO;
import com.tianya.basicframework.utils.TestCaseTools;
import org.junit.Test;

public class TestFastjson {
    @Test
    public void testParseFastjson() {
        String requestString = TestCaseTools.readTxtToString("testdata/request/request.json");
        PAICAssessmentStatusDataMO paicAssessmentStatusDataMO = JSONObject.parseObject(requestString, PAICAssessmentStatusDataMO.class);
        System.out.println(paicAssessmentStatusDataMO.getInsaicAssessmentNo());
    }
}
