package com.imooc.design.pattern.structural.facade;

/**
 * Created by amaze on 2019-03-04.
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+ pointsGift.getName()+"积分资格通过,库存通过");
        return  true;
    };
}
