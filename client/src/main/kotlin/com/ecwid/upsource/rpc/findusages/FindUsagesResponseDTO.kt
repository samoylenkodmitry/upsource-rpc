// Generated by the codegen. Please DO NOT EDIT!
// source: message.ftl

package com.ecwid.upsource.rpc.findusages

/**
 * @param filePathToRoot See FilePathToRootDTO parameters
 * @param item See FindUsagesItemDTO parameters
 */
@Suppress("unused")
data class FindUsagesResponseDTO(
	/**
	 * See FilePathToRootDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.FilePathToRootDTO
	 */
	val filePathToRoot: List<FilePathToRootDTO> = emptyList(),

	/**
	 * See FindUsagesItemDTO parameters (repeated)
	 * 
	 * @see com.ecwid.upsource.rpc.findusages.FindUsagesItemDTO
	 */
	val item: List<FindUsagesItemDTO> = emptyList()
)