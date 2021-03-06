package com.ssm.wuye.service;

import com.ssm.wuye.domain.ChElectricMeter;
import com.ssm.wuye.domain.ChElectricMeterExample;
import com.ssm.wuye.vo.ElectricAndOwer;

import java.util.List;

/**
 * time：2019/4/27--16:16
 * Author:蓝鑫杰
 * desc:
 * version:1.3.22
 */
public interface ChElectricService {
    List<ChElectricMeter> selectByExample(ChElectricMeterExample example);

    List<ElectricAndOwer> selectAll();

    ChElectricMeter selectByPrimaryKey(Integer electricid);

    int insertSelective(ChElectricMeter record);

    int updateByExampleSelective( ChElectricMeter record, ChElectricMeterExample example);

    int deleteByPrimaryKey(Integer electricid);
}
