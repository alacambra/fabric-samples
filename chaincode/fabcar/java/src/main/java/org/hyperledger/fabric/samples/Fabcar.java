package org.hyperledger.fabric.samples;

import org.hyperledger.fabric.shim.ChaincodeBase;
import org.hyperledger.fabric.shim.ChaincodeStub;

public class Fabcar extends ChaincodeBase {

  public static void main(String[] args) {
    new Fabcar().start(args);
  }

  public Response init(ChaincodeStub chaincodeStub) {

    Function function = Function.valueOf(chaincodeStub.getFunction());

    Response response = null;

    switch (function) {

      case queryCar:
        response = queryCar();
        break;
      case initLedger:
        response = initLedger();
        break;
      case createCar:
        response = createCar();
        break;
      case queryAllCars:
        response = queryAllCars();
        break;
      case changeCarOwner:
        response = changeCarOwner();
        break;
      case none:
        response = newErrorResponse("Invalid Smart Contract function name.");
        break;
    }

    return response;
  }

  public Response invoke(ChaincodeStub chaincodeStub) {
    return null;
  }


  public Response queryCar() {
    return null;
  }

  public Response initLedger() {
    return null;
  }

  public Response createCar() {
    return null;
  }

  public Response queryAllCars() {
    return null;
  }

  public Response changeCarOwner() {
    return null;
  }

}
