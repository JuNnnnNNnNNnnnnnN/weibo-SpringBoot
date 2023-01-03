package com.weibo.entity;

import com.weibo.constants.ResultConstants;
import org.springframework.stereotype.Component;

@Component
public class Result {

    private String returnCode;

    private String returnMsg;

    private Result nextLayerResult; // 下一层的返回结果

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Result getNextLayerResult() {
        return nextLayerResult;
    }

    public void setNextLayerResult(Result nextLayerResult) {
        this.nextLayerResult = nextLayerResult;
    }

    public Result success(){
        this.setReturnCode(ResultConstants.SUCCESS_CODE);
        this.setReturnMsg(ResultConstants.SUCCESS_MSG);
        return this;
    }

    public Result fail(){
        this.setReturnCode(ResultConstants.FAIL_CODE);
        this.setReturnMsg(ResultConstants.FAIL_MSG);
        return this;
    }

}
