package com.vigenere.model;

import static java.util.Arrays.asList;

import com.vigenere.service.CircularList;
import java.util.List;

public class Frequency {
    private final double FREQUENCY_PT = 0.072723;
    private final List<String> ALPHABET = asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z");

    public double getFREQUENCY_PT() {
        return FREQUENCY_PT;
    }

    public CircularList<String> getALPHABET() {
        var circular = new CircularList<String>();
        circular.addAll(ALPHABET);

     //   Buffer buf = new CircularFifoBuffer(4);

        return circular;
    }
    //    a(14.63),
//    b(1.04),
//    c(3.88),
//    d(4.99),
//    e(12.57),
//    f(1.02),
//    g(1.30),
//    h(1.28),
//    i(6.18),
//    j(0.40),
//    k(0.02),
//    l(2.78),
//    m(4.74),
//    n(5.05),
//    o(10.73),
//    p(2.52),
//    q(1.20),
//    r(6.53),
//    s(7.81),
//    t(4.34),
//    u(4.63),
//    v(1.67),
//    w(0.01),
//    x(0.21),
//    y(0.01),
//    z(0.47),
//    frequency_pt();


}
