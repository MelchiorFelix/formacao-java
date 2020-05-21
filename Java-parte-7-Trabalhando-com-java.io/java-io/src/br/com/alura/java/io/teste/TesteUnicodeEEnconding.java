package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "á";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		
		System.out.println(charset.displayName());
		
		Charset utf8 = StandardCharsets.UTF_8;
		byte[] bytes = s.getBytes(utf8);
		System.out.println(bytes.length);
		String string = new String(bytes);
		System.out.println(string);
		
		bytes = s.getBytes("UTF-8");
		System.out.println(bytes.length);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length);
	}

}
