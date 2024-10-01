package database;

import java.util.ArrayList;

import model.ChiTietDonHang;

public class ChiTietDonHangDAO implements DAOinterface<ChiTietDonHang>{
	private ArrayList<ChiTietDonHang> data=new ArrayList<ChiTietDonHang>();

	@Override
	public ArrayList<ChiTietDonHang> selectAll() {
		return this.data;
	
	}

	@Override
	public ChiTietDonHang selectById(ChiTietDonHang t) {
		for (ChiTietDonHang ChiTietDonHang : data) {
			if(ChiTietDonHang.equals(t)) {
				return ChiTietDonHang;
			}
			
		}
		return null;
	}

	@Override
	public int insert(ChiTietDonHang t) {
		if(this.selectById(t)==null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<ChiTietDonHang> arr) {
		int count=0;
		for (ChiTietDonHang ChiTietDonHang : arr) {
			count+=this.insert(ChiTietDonHang);
			
		}
		return count;
	}

	@Override
	public int delete(ChiTietDonHang t) {
		if(this.selectById(t)!=null) {
			this.data.remove(t);
				return 1;
		
			
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<ChiTietDonHang> arr) {
		int count=0;
		for (ChiTietDonHang ChiTietDonHang : arr) {
			count+=this.delete(ChiTietDonHang);
			
		}
		return count;
	}

	@Override
	public int update(ChiTietDonHang t) {
		 if(this.selectById(t)!=null) {
			 this.data.remove(t);
			 this.data.add(t);
			 return 1;
		 }
		 return 0;
	}

}
