package com.huatec.hiot_cloud.test.networktest;

import com.huatec.hiot_cloud.ui.base.BaseView;

/**
 * 网络封装测试MVP架构view层接口
 */
public interface TestNetworkPackView extends BaseView {
    /**
     * 显示Token
     * @param token
     */
    void showToken(String token);

    /**
     * 显示消息
     * @param message
     */
    void showMessage(String message);
}
