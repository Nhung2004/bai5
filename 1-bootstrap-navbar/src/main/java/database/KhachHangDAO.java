package database;

import java.util.ArrayList;

import model.KhachHang;

public class KhachHangDAO implements DAOinterface<KhachHang>{
	private ArrayList<KhachHang> data=new ArrayList<KhachHang>();

	@Override
	public ArrayList<KhachHang> selectAll() {
		return this.data;
	
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		for (KhachHang KhachHang : data) {
			if(KhachHang.equals(t)) {
				return KhachHang;
			}
			
		}
		return null;
	}

	@Override
	public int insert(KhachHang t) {
		if(this.selectById(t)==null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> arr) {
		int count=0;
		for (KhachHang KhachHang : arr) {
			count+=this.insert(KhachHang);
			
		}
		return count;
	}

	@Override
	public int delete(KhachHang t) {
		if(this.selectById(t)!=null) {
			this.data.remove(t);
				return 1;
		
			
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<KhachHang> arr) {
		int count=0;
		for (KhachHang KhachHang : arr) {
			count+=this.delete(KhachHang);
			
		}
		return count;
	}

	@Override
	public int update(KhachHang t) {
		 if(this.selectById(t)!=null) {
			 this.data.remove(t);
			 this.data.add(t);
			 return 1;
		 }
		 return 0;
	}

}
