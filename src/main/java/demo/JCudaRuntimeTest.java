package demo;

import jcuda.Pointer;
import jcuda.runtime.JCuda;

/**
 * @Author: Fang Rui
 * @Date: 2018/8/7
 * @Time: 15:25
 */
public class JCudaRuntimeTest {
    public static void main(String[] args) {
        Pointer pointer = new Pointer();
        JCuda.cudaMalloc(pointer, 4);
        System.out.println("Pointer: " + pointer);
        JCuda.cudaFree(pointer);
    }
}
