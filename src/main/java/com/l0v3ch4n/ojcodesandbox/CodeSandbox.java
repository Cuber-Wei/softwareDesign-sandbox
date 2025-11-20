package com.l0v3ch4n.ojcodesandbox;

import com.l0v3ch4n.ojcodesandbox.model.ExecuteCodeRequest;
import com.l0v3ch4n.ojcodesandbox.model.ExecuteCodeResponse;

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
