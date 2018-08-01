package com.jeremy.demo;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
//import com.fasterxml.jackson.datatype.threetenbp.deser.ThreeTenDateTimeDeserializerBase;


public class CustomInstantSerializer<OffsetDateTime> extends StdSerializer<OffsetDateTime> {
	  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat formatter
      = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
 
    public CustomInstantSerializer() {
        this(null);
    }
 
    public CustomInstantSerializer(Class t) {
        super(t);
    }
     


	@Override
	public void serialize(OffsetDateTime arg0, JsonGenerator arg1, SerializerProvider arg2) throws IOException {
		// TODO Auto-generated method stub
		arg1.writeString(arg0.toString());
	}
}
