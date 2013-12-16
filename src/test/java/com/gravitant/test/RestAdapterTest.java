package com.gravitant.test;

import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/*import com.gravitant.analytics.model.BillingData;
import com.gravitant.analytics.rest.adapter.RestAdapter;
import com.gravitant.billing.callables.CsvToDailyBillingData;*/
import com.gravitant.s3.model.S3Credential;
import com.gravitant.s3.model.S3File;
import com.gravitant.s3.model.S3FileResponse;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class RestAdapterTest extends AbstractJUnit4SpringContextTests {

	/*@Autowired
	private RestAdapter restAdapter;

	@Autowired
	private CsvToDailyBillingData csvToDailyBillingData;

	// @Test
	public void getS3UsersTest() {
		restAdapter.getS3Users(null);
	}

	// @Test
	public void getS3FileByPatternWithContent() throws Exception {

		S3FileResponse response = restAdapter.getS3Files("gul", null,
				"aws-billing-csv", null, true);
		List<BillingData> billingDataList = csvToDailyBillingData
				.convertCsvToBillingDataList(response.getFiles().get(0));
		Assert.notEmpty(billingDataList);
	}

	// @Test
	public void getS3FileByPatternWithOutContent() throws Exception {
		S3FileResponse response = restAdapter.getS3Files("gul", null,
				"aws-billing-csv", null, false);
		Assert.notNull(response);
	}

	// @Test
	public void getS3FilesByFileNameUsingGET() throws Exception {
		S3FileResponse response = restAdapter.getS3Files("gul",
				"236434463796-aws-billing-csv-2013-10-mod.csv", null, null,
				false);
		for (S3File file : response.getFiles()) {
			List<BillingData> billingDataList = csvToDailyBillingData
					.convertCsvToBillingDataList(file);
			Assert.notEmpty(billingDataList);
		}
	}

	@Test
	public void getS3FilesByFileNameUsingPOST() throws Exception {
		List<S3Credential> credentials = restAdapter.getS3Users("gul");
		S3FileResponse response = restAdapter
				.getS3Files(
						credentials.get(0),
						Collections
								.singletonList("236434463796-aws-billing-csv-2013-10-mod.csv"));
		for (S3File file : response.getFiles()) {
			List<BillingData> billingDataList = csvToDailyBillingData
					.convertCsvToBillingDataList(file);
			Assert.notEmpty(billingDataList);
		}
	}*/

}
