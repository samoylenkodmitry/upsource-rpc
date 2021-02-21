// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.analytics

/**
 * @param userValues Pulse values (number of commits in a week) for the current authenticated user
 * @param allValues Pulse values for all users in a project
 */
@Suppress("unused")
data class PulseResponseDTO(
	/**
	 * Pulse values (number of commits in a week) for the current authenticated user (repeated)
	 */
	val userValues: List<Int> = emptyList(),

	/**
	 * Pulse values for all users in a project (repeated)
	 */
	val allValues: List<Int> = emptyList()
)