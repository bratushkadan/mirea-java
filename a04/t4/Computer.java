package a04.t4;

import java.util.HashMap;

class Processor {
  private Object dataBus;
  private Object memoryBus;
  private Object alu;
  private Object L1Cache;
  private Object L2Cache;
  
  public final void accelerate() {}

  public final byte[] performCalculations() { return new byte[0]; }
}

class Memory {
  private Object RAM;
  private Object ROM;
  
  public final long allocate(int bytes, long addr) { return 0x00000000; }
  public final void deallocate(int bytes, long addr) {}
}

class Monitor {
  private HashMap<Integer, int[]> matrix = new HashMap<>();
  private Object sockets;
  private Object cables;

  public final boolean switchOff() { return true; };
  public final boolean switchOn() { return false; };
}

public class Computer {
  private Processor processor;
  private Memory memory;
  private Monitor monitor;

  private Brand brand;
  private String model;

  public Computer(Processor pr, Memory m, Monitor mon, Brand b, String mod) {
    this.processor = pr;
    this.memory = m;
    this.monitor = mon;

    this.brand = b;
    this.model = mod;
  }
}
