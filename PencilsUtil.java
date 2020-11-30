class PencilsUtil
{
		public static void main(String a[])
		{
		Pencils pencils = new Pencils();
		pencils.noOfBrands=90;
		System.out.println(pencils.name);
		System.out.println(pencils.type);
		System.out.println(pencils.noOfBrands);
		pencils.smoothWriting();
		pencils.easyToWrite();
		}
}