package com.ezen.project.service;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.project.model.BookingDTO;
import com.ezen.project.model.HotelDTO;
import com.ezen.project.model.NUserBookingDTO;
import com.ezen.project.model.RoomDTO;

@Service
public class HotelMapper {

	@Autowired
	private SqlSession sqlSession;
	
	// ����� ���������� ȣ���� ����� �� ����ϴ� �޼ҵ�
	public int inputHotel(HotelDTO hdto) {
		return sqlSession.insert("inputHotel", hdto);
	}
	
	// ����� ���������� ȣ���� ������ �� ����ϴ� �޼ҵ�
	public int deleteHotel(int h_num) {
		return sqlSession.delete("deleteHotel", h_num);
	}
	
	// Ư�� ȣ���� ���� �׷��� ������ Ȯ���ϴ� �޼ҵ�
	public int countRoomOnHotel(int h_num) {
		return sqlSession.selectOne("countRoomOnHotel", h_num);
	}
	
	// Ư�� ���� �׷��� ��ü ���Ǽ��� Ȯ���ϴ� �޼ҵ�
	public int countRoomOnGroup(String room_code) {
		return sqlSession.selectOne("countRoomOnGroup", room_code);
	}
	
	// ����� ���������� ȣ�� ������ ������ ���� ���, �� ȣ���� ������ ���� �����ϴ� �޼ҵ�
	public int deleteRoomOnHotel(int h_num) {
		return sqlSession.delete("deleteRoomOnHotel", h_num);
	}
	
	// ����� ���������� ȣ�� ������ ������ ���� ���, �� ȣ�ڿ� �Ҽӵ� ���Ƿ��ڵ��� �̹������� �̸��� ���� �������� �޼ҵ�
	// (���� �����뵵)
	public List<RoomDTO> getAllRoomImagesOnHotel(int h_num) {
		return sqlSession.selectList("getAllRoomImagesOnHotel", h_num);
	}
	
	// ����� ���������� ȣ�� ������ ������ �� ����ϴ� �޼ҵ�
	public int editHotel(HotelDTO hdto) {
		return sqlSession.update("editHotel", hdto);
	}
	
	// ����� ������ ȣ�� ����� �������� �޼ҵ�
	public List<HotelDTO> listHotel(int c_num) {
		return sqlSession.selectList("listHotel", c_num);
	}
	
	// ȣ�� ������ ������ �������� �޼ҵ�
	public HotelDTO getHotel(int h_num) {
		return sqlSession.selectOne("getHotel", h_num);
	}
	
	// ȣ�� ��Ͽ��� �ٷ� ���� �׷� ������� �Ѿ�� ��, �� ȣ���� h_num�� �޾ƿ��� ���� �޼ҵ�
	public int getMaxHnum() {
		return sqlSession.selectOne("getMaxHnum");
	}
	
	// ����� ���������� ������ ����� �� ����ϴ� �޼ҵ�
	public int inputRoom(RoomDTO rdto) {
		return sqlSession.insert("inputRoom", rdto);
	}
	
	// 
	public String checkRoomCodeExists(int h_num) {
		return sqlSession.selectOne("checkRoomCodeExists", h_num+"%");
	}
	
	// �ű� ���� �׷� ��Ͻ�, room_code ���ڸ����� +1�� �ϱ� ���� ���� ���� �׷��� room_code�� ���� ū ���� �������� �޼ҵ�
	public int getMaxRoomCode(int h_num) {
		List<String> rcodeList = sqlSession.selectList("getMaxRoomCode", h_num+"%");
		
		String[] arr = rcodeList.toArray(new String[rcodeList.size()]);
		int[] numarr = new int[rcodeList.size()];
		
		for(int i=0; i<rcodeList.size(); ++i) {
			String[] arr2 = arr[i].split("_");
			numarr[i] = Integer.parseInt(arr2[1]);
		}
		
		Arrays.sort(numarr);
		
		return numarr[numarr.length-1];
	}
	
	// ����� ���������� ������ �׷� ������ ������ �� ����ϴ� �޼ҵ�
	public int deleteRoomGroup(String room_code) {
		return sqlSession.delete("deleteRoomGroup", room_code+"%");
	}
	
	// ����� ���������� ���� 1���� ������ �� ����ϴ� �޼ҵ�
	public int deleteRoom(int room_num) {
		return sqlSession.delete("deleteRoom", room_num);
	}
	
	// ����� ���������� ���� ������ �׷� ������ ������ �� ����ϴ� �޼ҵ�
	public int editRoomGroup(RoomDTO rdto) {
		return sqlSession.update("editRoomGroup", rdto);
	}
	
	// ȣ���� ���� �׷� ����� �������� �޼ҵ�
	public List<RoomDTO> listRoomGroup(int h_num) {	
		return sqlSession.selectList("listRoomGroup", h_num);
	}
	
	// ���Ǳ׷��� ���� ���� ����� �������� �޼ҵ�
	public List<RoomDTO> listRoom(String room_code) {	
		return sqlSession.selectList("listRoom", room_code);
	}

	// ���� �׷쿡�� room_num�� ���� ���� ���� 1���� ������ ��ǥ�� �������� �޼ҵ�
	public RoomDTO getRoomByRoomNum(int room_num) {
		return sqlSession.selectOne("getRoomByRoomNum", room_num);
	}
	
	public String getRoomType(int room_num) {
		return sqlSession.selectOne("getRoomType", room_num);
	}
	
	// ���� ��Ȱ��ȭ�� ���� �޼ҵ�
	public int disableRoom(int room_num) {
		return sqlSession.update("disableRoom", room_num);
	}
	
	// ���� Ȱ��ȭ�� ���� �޼ҵ�
	public int enableRoom(int room_num) {
		return sqlSession.update("enableRoom", room_num);
	}
	
	// ȣ���� ���� ����� �������� �޼ҵ�
	public List<BookingDTO> listBookingByHotel(int h_num) {
		return sqlSession.selectList("listBookingByHotel", h_num);
	}
	
	// ȣ�� ��ȣ�� ȣ�� �̸��� �������� �޼ҵ�
	public String getHnameByHnum(int h_num) {
		return sqlSession.selectOne("getHnameByHnum", h_num);
	}
	
	// ����� ���� ����Ʈ ���������� ���� Ȯ���� ����ϴ� �޼ҵ�
	public int confirmBooking(int book_num) {
		return sqlSession.update("confirmBooking", book_num);
	}
	
	// ����� ���� ����Ʈ ���������� ���� ��ҽ� ����ϴ� �޼ҵ�
	public int denyBooking(int book_num) {
		return sqlSession.update("denyBooking", book_num);
	}
	
	public int checkinBooking(int book_num) {
		return sqlSession.update("checkinBooking", book_num);
	}
	
	public int checkoutBooking(int book_num) {
		return sqlSession.update("checkoutBooking", book_num);
	}
	
	
	// �׽�Ʈ
	public List<HotelDTO> listHotel2() {
		return sqlSession.selectList("listHotel2");
	}

	public List<NUserBookingDTO> listNUBookingByHotel(int h_num) {
		return sqlSession.selectList("nUserBookList",h_num);
	}

	public int confirmnBooking(int book_num) {
		return sqlSession.update("confirmnBooking", book_num);
	}
	
	// ����� ���� ����Ʈ ���������� ���� ��ҽ� ����ϴ� �޼ҵ�
	public int denynBooking(int book_num) {
		return sqlSession.update("denynBooking", book_num);
	}
	
	public int checkinnBooking(int book_num) {
		return sqlSession.update("checkinnBooking", book_num);
	}
	
	public int checkoutnBooking(int book_num) {
		return sqlSession.update("checkoutnBooking", book_num);
	}
}