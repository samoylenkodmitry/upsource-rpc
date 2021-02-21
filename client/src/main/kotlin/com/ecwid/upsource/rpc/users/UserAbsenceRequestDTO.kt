// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.users

/**
 * @param absentUntil Absence end date
 * @param userId User ID in Upsource ("null" denotes current user)
 */
@Suppress("unused")
data class UserAbsenceRequestDTO(
	/**
	 * Absence end date (optional)
	 */
	val absentUntil: Long? = null,

	/**
	 * User ID in Upsource ("null" denotes current user) (optional)
	 */
	val userId: String? = null
)