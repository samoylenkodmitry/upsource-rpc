// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.projects

data class RevisionBuildStatusListDTO(
	/**
	 * Build status: Success(1), Failed(2), InProgress(3) (repeated)
	 */
	val buildStatus: List<RevisionBuildStatusDTO> = emptyList()
)