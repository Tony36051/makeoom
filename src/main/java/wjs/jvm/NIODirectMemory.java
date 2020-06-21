package wjs.jvm;

import sun.java2d.loops.TransformHelper;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NIODirectMemory {
    public ByteBuffer makeDirectMemoryNBytes(int capacity) {
        return ByteBuffer.allocateDirect(capacity);
    }

    public static void main(String[] args) throws InterruptedException {
        List nioRefs = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("add 1M NIO");
            String  s = scanner.nextLine();

            nioRefs.add(new NIODirectMemory().makeDirectMemoryNBytes(1024));

        }
    }
}
