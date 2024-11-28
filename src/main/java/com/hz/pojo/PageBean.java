package com.hz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

/**
 * @ProjectName tlias-web-management
 * @Description TODO
 * @Author Zhao Xuyang
 * @Date 2024/11/28 16:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {

    private long total;//总记录数
    private List rows;//当前数据列表

}
