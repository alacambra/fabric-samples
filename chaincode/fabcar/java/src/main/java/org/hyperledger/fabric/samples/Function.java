package org.hyperledger.fabric.samples;

import java.util.stream.Stream;

public enum Function {
  queryCar,
  initLedger,
  createCar,
  queryAllCars,
  changeCarOwner,
  none;

  public Function fromString(String function) {

    return Stream.of(Function.values()).findAny().orElse(none);

  }
}
