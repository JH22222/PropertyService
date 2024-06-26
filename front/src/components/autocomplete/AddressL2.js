import { fetchAddressesLevel2 } from '@/store/slices/addressSlice'
import { Autocomplete, TextField } from '@mui/material'
import { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'

const AddressL2 = ({ onChange }) => {
  const dispatch = useDispatch()
  const { addressL2Options, level2Status, level2Error, addressL1 } =
    useSelector((state) => state.address)

  useEffect(() => {
    dispatch(fetchAddressesLevel2(addressL1))
  }, [addressL1, dispatch])

  const handleAddressChange = (event, value) => {
    onChange(value ? value.addressLevel2Id : '')
  }
  return (
    <Autocomplete
      options={addressL2Options || []}
      getOptionLabel={(addressL2Options) =>
        addressL2Options.addressLevel2 || ''
      }
      onChange={handleAddressChange}
      renderInput={(params) => (
        <TextField {...params} label="Address Level 2" />
      )}
    />
  )
}

AddressL2.displayName = 'AddressL2'

export default AddressL2
