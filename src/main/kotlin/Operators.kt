package com.wallace.math.complex

import org.apache.commons.math3.complex.Complex

/**
 * Negation operator.
 * @see [Complex#negate]
 */
operator fun Complex.unaryMinus(): Complex = this.negate()

/**
 * Addition operator.
 * @see [Complex#add]
 */
operator fun Complex.plus(other: Complex): Complex = this.add(other)
/**
 * Addition operator.
 * @see [Complex#add]
 */
operator fun Complex.plus(other: Double): Complex = this.add(other)
/**
 * Addition operator.
 * @see [Complex#add]
 */
// Note: In addition, order does not matter.
operator fun Double.plus(other: Complex): Complex = other + this

/**
 * Subtraction operator.
 * Complex - Complex.
 * @see [Complex#subtract]
 */
operator fun Complex.minus(other: Complex): Complex = this.subtract(other)
/**
 * Subtraction operator.
 * Complex - Double.
 * @see [Complex#subtract]
 */
operator fun Complex.minus(other: Double): Complex = this.subtract(other)
/**
 * Subtraction operator.
 * Double - Complex.
 * @see [Complex#subtract]
 */
// Note: In subtraction, order matters. As such we negate other and add it to the double. This is identical to
// this - other
operator fun Double.minus(other: Complex): Complex = -other + this

/**
 * Multiplication operator.
 * Complex * Complex.
 * @see [Complex#multiply]
 */
operator fun Complex.times(other: Complex): Complex = this.multiply(other)
/**
 * Multiplication operator.
 * Complex * Double.
 * @see [Complex#multiply]
 */
operator fun Complex.times(other: Double): Complex = this.multiply(other)
/**
 * Multiplication operator.
 * Double * Complex.
 * @see [Complex#multiply]
 */
// Note: In multiplication, order does not matter.
operator fun Double.times(other: Complex): Complex = other.multiply(this)

/**
 * Division operator.
 * Complex / Complex.
 * @see [Complex#multiply]
 */
operator fun Complex.div(other: Complex): Complex = this.divide(other)
/**
 * Division operator.
 * Complex / Double.
 * @see [Complex#multiply]
 */
operator fun Complex.div(other: Double): Complex = this.divide(other)
/**
 * Division operator.
 * Double / Complex.
 * @see [Complex#multiply]
 */
// Note: Multiplying by the reciprocal is identical to dividing.
operator fun Double.div(other: Complex): Complex = this * other.reciprocal()

/**
 * Exponent operator.
 * Complex ^ Complex.
 * @see [Complex#multiply]
 */
infix fun Complex.pow(exponent: Complex): Complex = this.pow(exponent)
/**
 * Exponent operator.
 * Complex ^ Double.
 * @see [Complex#multiply]
 */
infix fun Complex.pow(exponent: Double): Complex = this.pow(exponent)

/**
 * Convenience property for phase angle.
 * Identical to [Complex#argument]
 * @see [Complex#argument]
 */
val Complex.phase : Double get() = argument
