package com.houarizegai.joobypoc;

import org.jooby.Jooby;
import org.jooby.apitool.ApiTool;

public class Main extends Jooby {

    {
        port(8095);

        use(new ApiTool()
                .swagger("/swagger")
                .raml("/raml")
        );

        use(CustomPaymentServlet.class);
    }
    public static void main(String[] args) {
        run(Main::new);
    }
}
