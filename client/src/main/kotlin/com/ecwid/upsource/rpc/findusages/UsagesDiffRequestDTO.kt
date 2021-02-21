// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param fullRequest See UsagesDiffFullRequestDTO parameters
 * @param requestByAnotherRevision See UsagesDiffByAnotherRevisionRequestDTO parameters
 * @param requestByBoundaryRevisions See UsagesDiffByBoundaryRevisionsRequestDTO parameters
 */
@Suppress("unused")
data class UsagesDiffRequestDTO(
	/**
	 * See UsagesDiffFullRequestDTO parameters (optional)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.UsagesDiffFullRequestDTO
	 */
	val fullRequest: UsagesDiffFullRequestDTO? = null,

	/**
	 * See UsagesDiffByAnotherRevisionRequestDTO parameters (optional)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.UsagesDiffByAnotherRevisionRequestDTO
	 */
	val requestByAnotherRevision: UsagesDiffByAnotherRevisionRequestDTO? = null,

	/**
	 * See UsagesDiffByBoundaryRevisionsRequestDTO parameters (optional)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.UsagesDiffByBoundaryRevisionsRequestDTO
	 */
	val requestByBoundaryRevisions: UsagesDiffByBoundaryRevisionsRequestDTO? = null
)