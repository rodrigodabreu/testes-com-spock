package example

import spock.lang.Specification

class MathSpec extends Specification {

    def '2 ao quadrado deve ser 4' () {
        expect:
        Math.pow(2,2) == 4
    }
}
