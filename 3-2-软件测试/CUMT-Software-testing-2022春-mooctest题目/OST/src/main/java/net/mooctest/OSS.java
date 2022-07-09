package net.mooctest;

import java.util.Set;

/**
 * 此接口为顺序统计树定义API
 */
public interface OSS<T> extends Set<T> {
    
    T get(int index);
    
    int indexOf(T element);
}
