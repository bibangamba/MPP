package prob7b;

@FunctionalInterface
public interface QuadriFunction<S,T,U,V, R> {
	R apply(S s, T t, U u, V v);
}
