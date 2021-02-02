package domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@ToString
@NoArgsConstructor
@Getter
@Setter
@DynamoDBTable(tableName = "wywozy_dzielnica")
public class WasteDisposalForDistrict {

    @DynamoDBHashKey(attributeName = "dzielnica")
    private String dzielnica;

    @DynamoDBAttribute(attributeName = "dni_wywozu")
    private List<WasteDisposalDayInfo> dniWywozu;
}
