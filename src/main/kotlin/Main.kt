package org.example

import build.buf.gen.address.v1.State
import build.buf.gen.event.event_a.v2.eventA
import build.buf.protovalidate.Validator

fun main() {
    val eventA = eventA {
        foo = 2
        state = State.STATE_MAINE
    }

    // validation example
    val validator = Validator()
    val result = validator.validate(eventA)
    assert(result.violations.size == 0)
}
