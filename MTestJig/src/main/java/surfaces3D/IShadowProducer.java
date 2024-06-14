package surfaces3D;


public interface IShadowProducer {
  <T> IShadowCalculator<T> getShadowCalculator();
}
