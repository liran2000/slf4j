/**
 * This module implements an SLF4J adapter for the java.logging package.
 */
module org.slf4j.jul {
  requires org.slf4j;
  requires java.logging;
  provides org.slf4j.spi.SLF4JServiceProvider with org.slf4j.jul.JULServiceProvider;
  opens org.slf4j.jul to org.slf4j;

  exports org.slf4j.jul;
}
