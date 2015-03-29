package com.github.pedrovgs.nox.path;

/**
 * Describes where NoxView has to draw NoxItems inside the space available in NoxView.
 *
 * @author Pedro Vicente Gomez Sanchez.
 */
public abstract class Path {

  private final PathConfig pathConfig;

  public Path(PathConfig pathConfig) {
    this.pathConfig = pathConfig;
  }

  public abstract float getLeftForItemAtPosition(int position);

  public abstract float getRightForItemAtPosition(int position);
}
