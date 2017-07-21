package com.meiling.lib.calculate;

/**
 * Created by Administrator on 2017/7/21.
 */

public interface IOperation {
    Object doOperation(Object... args);
    Object[] doOperation(int size,Object... args);
}
