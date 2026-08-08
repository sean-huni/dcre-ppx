package za.co.fnb.dcre.ppx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import za.co.fnb.dcre.platform.batch.ExitCodeMain;
import za.co.fnb.dcre.platform.batch.config.BatchJdbcConfig;
import za.co.fnb.dcre.platform.batch.config.HeartbeatDatasourceConfig;
import za.co.fnb.dcre.platform.persistence.JdbcConfig;

@SpringBootApplication
@Import({JdbcConfig.class, BatchJdbcConfig.class, HeartbeatDatasourceConfig.class})
public class PpxApplication {

    public static void main(String[] args) {
        ExitCodeMain.run(PpxApplication.class, args);
    }
}
