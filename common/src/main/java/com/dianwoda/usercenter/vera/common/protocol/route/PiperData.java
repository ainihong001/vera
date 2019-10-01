package com.dianwoda.usercenter.vera.common.protocol.route;

/**
 * @author seam
 */
public class PiperData {

  private String location;
  private String group;
  private int piperId;

  public PiperData(String location, String group, int piperId) {
    this.location = location;
    this.group = group;
    this.piperId = piperId;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public int getPiperId() {
    return piperId;
  }

  public void setPiperId(int piperId) {
    this.piperId = piperId;
  }

  @Override
  public int hashCode() {
    return location.hashCode() + group.hashCode() + piperId;
  }

  @Override
  public boolean equals(Object obj) {
    PiperData piperData = (PiperData)obj;
    if (this.location.equals(piperData.location) &&
            this.group.equals(piperData.group) &&
            this.piperId == piperData.piperId) {
      return true;
    }
    return false;
  }
}