package domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.*;

@ToString
@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@DynamoDBDocument
public class WasteDisposalDayInfo {

    @DynamoDBAttribute(attributeName = "dzien")
    private String dzien;

    @DynamoDBAttribute(attributeName = "tydz")
    private String tydz;

    @DynamoDBAttribute(attributeName = "typ")
    private String typ;
}
