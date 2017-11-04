@file:Suppress("unused")

package com.example.gdgdevfest17

@Target(AnnotationTarget.FIELD)
annotation class NotNull

@Target(AnnotationTarget.CLASS)
annotation class XmlRootElement

@Target(AnnotationTarget.PROPERTY_GETTER)
annotation class XmlElement


// Proxiability
// - instance managed by the application container
// - could even go as far as subclassing to have proper control
// NO-arg plugin counterpart, all-open

@XmlRootElement
class MagicParams(
        @get:XmlElement @field:NotNull var phone: String? = null,
        @get:XmlElement @field:NotNull var email: String? = null,
        @get:XmlElement @field:NotNull var firstName: String? = null,
        @get:XmlElement @field:NotNull var lastName: String? = null,
        @get:XmlElement @field:NotNull var address: String? = null,
        @get:XmlElement @field:NotNull var city: String? = null,
        @get:XmlElement @field:NotNull var preferredLanguage: String? = null
)


@XmlRootElement
class MagicParamsBetter(
        @get:XmlElement @field:NotNull var phone: String,
        @get:XmlElement @field:NotNull var email: String,
        @get:XmlElement @field:NotNull var firstName: String,
        @get:XmlElement @field:NotNull var lastName: String,
        @get:XmlElement @field:NotNull var address: String,
        @get:XmlElement @field:NotNull var city: String,
        @get:XmlElement @field:NotNull var preferredLanguage: String
)
