
public class PrimitiveDataTypes{

	/* 
		8-bit 
		-128 to 127
	*/
	public byte bl = -128;
	public byte bh = 127;

	/*	
		16-bit
		-32,768  to 32,767
	*/
	public short sl = -32_768;
	public short sh = 32_767;

	/*
		32-bit
		- 2,147,483,648 (-2^31) to 2,147,483,647(inclusive) (2^31 -1)
	*/
	public int il = -2_147_483_648;
	public int ih = 2_147_483_647;

	/*
		64-bit
		-9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
	*/
	public long ll = -9_223_372_036_854_775_808L;
	public long lh = 9_223_372_036_854_775_807L;


	/* floating point variables */

	/*
		32-bit
	*/
	
	public float f = 11.22f;

	/*
		64-bit (double precision floating point)
	*/
	public double d = 11.22d;
}