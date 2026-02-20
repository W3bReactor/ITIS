package ru.itis.project.args;

public class NotFoundNextArgument extends RuntimeException {
  public NotFoundNextArgument(String message) {
    super(message);
  }
}
