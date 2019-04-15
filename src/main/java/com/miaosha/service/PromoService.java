package com.miaosha.service;

import com.miaosha.service.model.PromoModel;

/**
 * @author dalongm
 * @date 2019/4/15 20:21
 * @description
 */
public interface PromoService {
    // 根据item id获取即将进行的或正在进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
