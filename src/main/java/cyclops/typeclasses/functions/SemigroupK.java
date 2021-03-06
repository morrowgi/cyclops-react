package cyclops.typeclasses.functions;


import com.aol.cyclops2.hkt.Higher;
import cyclops.function.BinaryFn;
import cyclops.function.Semigroup;

import java.util.function.BinaryOperator;

@FunctionalInterface
public interface SemigroupK<W,T>  extends Semigroup<Higher<W,T>> {

    @Override
   Higher<W,T> apply(Higher<W,T> t1, Higher<W,T> t2);

}

