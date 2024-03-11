package com.dunston.dengojcodesandbox;


import com.dunston.dengojcodesandbox.model.ExecuteCodeRequest;
import com.dunston.dengojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
