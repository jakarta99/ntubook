package org.ntubook.common.ajax;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AjaxResponse {

	private Object data;
	
	private List<String> messages;
	
}
