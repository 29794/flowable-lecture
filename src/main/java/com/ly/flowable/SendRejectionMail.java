package com.ly.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author 29794
 * @date 2022/11/7 18:16
 */
public class SendRejectionMail implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("请假被拒绝...安心工作吧!");
    }
}
